package org.chy.anubis.treasury.testcase.exception;

public class ResultErrorException extends RuntimeException {

    String currentResult;
    String expectResult;

    public ResultErrorException(String currentResult, String expectResult) {
        this.currentResult = currentResult;
        this.expectResult = expectResult;
    }
}
