package FileHandling;

import java.io.*;

public class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("students.dat", "rw");

        raf.writeInt(101);
        writeFixedString(raf, "Pranav", 20);
        raf.writeDouble(85.5);

        raf.writeInt(102);
        writeFixedString(raf, "Ayushi", 20);
        raf.writeDouble(78.5);

        raf.writeInt(103);
        writeFixedString(raf, "Amit", 20);
        raf.writeDouble(91.0);

        raf.writeInt(104);
        writeFixedString(raf, "Sid", 20);
        raf.writeDouble(74.5);

        raf.writeInt(105);
        writeFixedString(raf, "Nikhil", 20);
        raf.writeDouble(88.0);

        long position = (3 - 1) * 32;
        raf.seek(position);

        int id = raf.readInt();
        String name = readFixedString(raf, 20);
        double marks = raf.readDouble();

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        raf.close();
    }

    static void writeFixedString(RandomAccessFile raf, String text, int length) throws IOException {

        StringBuilder sb = new StringBuilder(text);
        while (sb.length() < length) {
            sb.append(" ");
        }
        raf.writeBytes(sb.substring(0, length));
    }

    static String readFixedString(RandomAccessFile raf, int length) throws IOException {

        byte[] bytes = new byte[length];
        raf.readFully(bytes);
        return new String(bytes).trim();
    }
}
