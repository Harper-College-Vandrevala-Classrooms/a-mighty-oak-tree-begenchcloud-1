package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

    private OakTree.Node root;
    private OakTree.Squirrel squirrel1;
    private OakTree.Squirrel squirrel2;
    private OakTree.Squirrel squirrel3;

    @BeforeEach
    void setUp() {
        squirrel1 = new OakTree.Squirrel("Cheeks");
        squirrel2 = new OakTree.Squirrel("Squeaks");
        squirrel3 = new OakTree.Squirrel("Mr. Fluffy Butt");

        root = new OakTree.Node(squirrel1);
    }

    @Test
    void testAddChildren() {
        OakTree.Node leftChild = new OakTree.Node(squirrel2);
        OakTree.Node rightChild = new OakTree.Node(squirrel3);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        assertEquals("Squeaks", root.left().getSquirrel().getName());
        assertEquals("Mr. Fluffy Butt", root.right().getSquirrel().getName());
    }

    @Test
    void testInitialNode() {
        assertEquals("Cheeks", root.getSquirrel().getName());
        assertNull(root.left());
        assertNull(root.right());
    }

    @Test
    void testTreeTraversal() {
        OakTree.Node leftChild = new OakTree.Node(squirrel2);
        OakTree.Node rightChild = new OakTree.Node(squirrel3);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        assertEquals("Squeaks", root.left().getSquirrel().getName());
        assertEquals("Mr. Fluffy Butt", root.right().getSquirrel().getName());
    }
}
