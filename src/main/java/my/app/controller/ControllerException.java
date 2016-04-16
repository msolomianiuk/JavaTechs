package my.app.controller;

public class ControllerException extends RuntimeException {
    public ControllerException() {

    }

    public ControllerException(String message) {
        super(message);
    }
}
