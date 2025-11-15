
package com.project.security;

import java.nio.file.*;
import javax.crypto.SecretKey;

public class FileManager {

    public static void storeFile(String path, byte[] data, SecretKey key) throws Exception {
        byte[] encrypted = EncryptionUtil.encrypt(data, key);
        Files.write(Paths.get(path), encrypted);
    }

    public static byte[] readFile(String path, SecretKey key) throws Exception {
        byte[] encrypted = Files.readAllBytes(Paths.get(path));
        return EncryptionUtil.decrypt(encrypted, key);
    }
}
