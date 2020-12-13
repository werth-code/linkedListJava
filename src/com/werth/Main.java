package com.werth;

public class Main {

    public static void main(String[] args) {

        WerthList werthList = new WerthList();

        werthList = WerthList.insert(werthList, 1);
        werthList = WerthList.insert(werthList, 2);
        werthList = WerthList.insert(werthList, 3);

        WerthList.deleteNode(werthList, 2);

        WerthList.printWerthList(werthList);
    }
}
