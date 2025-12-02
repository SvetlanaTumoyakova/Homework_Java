package Homework_1;

class Main {
    public static void main(String[] args) {
        System.out.printf(
                "Переменная типа %-6s занимает %2d Байт памяти (%2d бит памяти), и принимает значения в диапазоне от %d до %d%n",
                byte.class.getName(), Byte.BYTES, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE
        );

        System.out.printf(
                "Переменная типа %-6s занимает %2d Байт памяти (%2d бит памяти), и принимает значения в диапазоне от %d до %d%n",
                short.class.getName(), Short.BYTES, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE
        );

        System.out.printf(
                "Переменная типа %-6s занимает %2d Байт памяти (%2d бит памяти), и принимает значения в диапазоне от %d до %d%n",
                int.class.getName(), Integer.BYTES, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE
        );

        System.out.printf(
                "Переменная типа %-6s занимает %2d Байт памяти (%2d бит памяти), и принимает значения в диапазоне от %d до %d%n",
                long.class.getName(), Long.BYTES, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE
        );

        System.out.printf(
                "Переменная типа %-6s занимает %2d Байт памяти (%2d бит памяти), и принимает значения в диапазоне от %.6e до %.6e%n",
                float.class.getName(), Float.BYTES, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE
        );

        System.out.printf(
                "Переменная типа %-6s занимает %2d Байт памяти (%2d бит памяти), и принимает значения в диапазоне от %.6e до %.6e%n",
                double.class.getName(), Double.BYTES, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE
        );

    }
}