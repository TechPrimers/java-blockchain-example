package com.techprimers.blockchain;

import java.util.Arrays;

public class BlockChainExample {

    public static void main(String[] args) {

        /*

        BlockChain -
        Block - Hash of Previous Block + Transactions
        Chained together.

         */

        Transaction transaction1 = new Transaction("Peter", "Sam", 100L);
        Transaction transaction2 = new Transaction("Sam", "Ryan", 1000L);
        Transaction transaction3 = new Transaction("Sam", "Ryan", 1000L);
        Transaction transaction4 = new Transaction("Ryan", "Peter", 150L);

        Block firstBlock = new Block(0, Arrays.asList(transaction1, transaction2));
        System.out.println(firstBlock.hashCode());
        Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(transaction3));
        System.out.println(secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction4));
        System.out.println(thirdBlock.hashCode());

    }
}
