package com.kodilla.spring.portfolio;

public class Board {
    private TaskList todoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList todoList, TaskList inProgressList, TaskList doneList) {
        this.todoList = todoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getTodoList() {
        return todoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

}
