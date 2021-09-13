package com.jlu.lmsweb.utils;


public class ProgressBarUtil {


    private String getChar(int num, char ch) {
        return String.valueOf(ch).repeat(Math.max(0, num));
    }

    public void printProgress(String title) throws InterruptedException {
        int index = 0;
        int BITE = 2;
        int PROGRESS_SIZE = 50;
        System.out.print(title);

        String finish = getChar(0, '█');
        String unFinish = getChar(PROGRESS_SIZE, '─');
        String target = String.format("%3d%%[%s%s]", index, finish, unFinish);
        System.out.print(target);

        while (index <= 100) {
            finish = getChar(index / BITE, '█');
            unFinish = getChar(PROGRESS_SIZE - index / BITE, '─');

            target = String.format("%3d%%├%s%s┤", index, finish, unFinish);
            System.out.print(getChar(PROGRESS_SIZE + 6, '\b'));
            System.out.print(target);

            Thread.sleep(50);
            index++;
        }
    }

    public static void main(String[] args) {
        ProgressBarUtil barUtil = new ProgressBarUtil();
        try {
            for (int i = 0; i < 10; i++) {
                barUtil.printProgress("ProgressBar: ");
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
