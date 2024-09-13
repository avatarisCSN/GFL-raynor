package org.example;

public class Connection {
    private boolean isOpen = false;

    public void open() {
        isOpen = true;
    }

    public void close() {
        if (!isOpen) {
            throw new IllegalStateException("Connection is already closed.");
        }
        isOpen = false;
    }

    public void sendData(String data) {
        if (!isOpen) {
            throw new IllegalStateException("Cannot send data. Connection is closed.");
        }
        System.out.println("Sending data: " + data);
    }

    public static void main(String[] args) {
        Connection connection = new Connection();

        // Попытка отправить данные, когда соединение закрыто
        connection.sendData("Test data");  // Throws IllegalStateException because connection is not opened yet

        connection.open();  // Open connection
        connection.sendData("Test data");  // Works fine
        connection.close();  // Close connection
        connection.sendData("Test data");  // Throws IllegalStateException because connection is closed
    }
}