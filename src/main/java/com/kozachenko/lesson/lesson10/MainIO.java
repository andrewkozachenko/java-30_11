package com.kozachenko.lesson.lesson10;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MainIO {

    public static void main(String[] args) {
        channelII();

    }

    private static void channel() {
        try (FileChannel channel = (FileChannel) Files.newByteChannel(
                Paths.get("first.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

            ByteBuffer buffer = ByteBuffer.allocate(26);
            for (int i =0; i < buffer.capacity(); i++){
                buffer.put((byte)('A'+i));
            }
            buffer.rewind();
            channel.write(buffer);
        } catch (IOException e) {
            System.out.println("Input / output Error");
        }
    }

    private static void channelII() {
        try (FileChannel channel = (FileChannel) Files.newByteChannel(
                Paths.get("file.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < buffer.capacity(); i++){
                buffer.put((byte) ('A' + i));
            }
        } catch (IOException e) {
            System.out.println("Input / output Error");
        }
    }
}
