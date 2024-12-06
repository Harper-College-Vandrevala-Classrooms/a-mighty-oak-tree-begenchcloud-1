package com.csc;

public class OakTree {

    public static class Squirrel {
        private String name;

        public Squirrel(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class Node {
        private Squirrel squirrel;
        private Node left;
        private Node right;

        public Node(Squirrel squirrel) {
            this.squirrel = squirrel;
        }

        public Squirrel getSquirrel() {
            return squirrel;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node left() {
            return this.left;
        }

        public Node right() {
            return this.right;
        }
    }

    public static void main(String[] args) {

        Squirrel cheeks = new Squirrel("Cheeks");
        Node nodeOne = new Node(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node nodeTwo = new Node(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node nodeThree = new Node(fluffybutt);

        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);

        System.out.println("Root Node: " + nodeOne.getSquirrel().getName());
        System.out.println("Left Child: " + nodeOne.left().getSquirrel().getName());
        System.out.println("Right Child: " + nodeOne.right().getSquirrel().getName());
    }
}
