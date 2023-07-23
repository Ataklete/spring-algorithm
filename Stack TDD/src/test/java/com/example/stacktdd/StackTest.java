package com.example.stacktdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.function.Executable;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    public void isEmpty_Returns_IfStackIsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void isEmpty_ReturnFalse_IfPushIsCalled(){
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void peak_Returnsnull_IfStackIsEmpty(){
        assertNull(stack.peek());
    }

    @Test
    public void peek_ReturnsMostRecent_pushedValue(){
        stack.push(1);
        assertEquals(1, stack.peek());
    }
    @Test()
    //in unit test 4 use (expected = EmptyStackException.class)
    public void pop_ThrowsEmptyStackException_IfStackIsEmpty() {
        assertThrows(EmptyStackException.class, (Executable) stack.pop());
    }

    @Test
    public void pop_returnsMost_PushedValue(){
        stack.push(3);
        assertEquals(3, stack.pop());
    }

    @Test
    public void peek_ReturnNull_afterPopIsCalled(){
        stack.push(1);
        stack.pop();
        assertEquals(null,stack.peek());
    }

    @Test
    public void isEmpty_ReturnTrue_afterPopIsCalled(){
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
        //if you need to make fail comment on pop() data = null;
    }

    @Test
    public void peek_ReturnsFirstValue_IfPushTwice_popOnce(){
         stack.push(1);
         stack.push(2);
         stack.pop();
         assertEquals(1, stack.peek());
    }

    @Test
    public void contains_ReturnTrue_IfValueIsPresent(){
         stack.push(1);
         stack.push(2);
         stack.push(3);
         assertTrue(stack.contains(1));
//         assertTrue(stack.contains(2));
//         assertTrue(stack.contains(3));
    }
    @Test
    public void contains_ReturnFalse_IfValueIsNotPresent(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertFalse(stack.contains(4));
    }
}