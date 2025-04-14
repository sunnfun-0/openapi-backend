package com.openapi.common.util;

import org.springframework.stereotype.Component;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * 密码加密工具类
 * 使用PBKDF2加密算法
 *
 * @author sunnao
 * @since 2025-04-13
 */
@Component
public class PasswordEncoder {
    
    private static final int ITERATIONS = 65536; // 迭代次数
    private static final int KEY_LENGTH = 256; // 密钥长度
    
    // 生成盐值
    public static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }
    
    // 加密密码
    public static String encode(String password, String salt) {
        try {
            PBEKeySpec spec = new PBEKeySpec(
                password.toCharArray(),
                Base64.getDecoder().decode(salt),
                ITERATIONS,
                KEY_LENGTH
            );
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            byte[] hash = skf.generateSecret(spec).getEncoded();
            return Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            throw new RuntimeException("加密失败", e);
        }
    }
    
    // 验证密码
    public static boolean matches(String rawPassword, String encodedPassword, String salt) {
        String newEncoded = encode(rawPassword, salt);
        return newEncoded.equals(encodedPassword);
    }
    
    // 加密并将结果与盐值一起存储
    public static String encode(String password) {
        String salt = generateSalt();
        String hash = encode(password, salt);
        return hash + "$" + salt; // 使用$分隔哈希值和盐值
    }
    
    // 验证组合格式的密码
    public static boolean matches(String rawPassword, String storedPassword) {
        String[] parts = storedPassword.split("\\$");
        if (parts.length != 2) return false;
        
        String hash = parts[0];
        String salt = parts[1];
        return encode(rawPassword, salt).equals(hash);
    }
}