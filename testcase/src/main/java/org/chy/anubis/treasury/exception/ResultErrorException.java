package org.chy.anubis.treasury.exception;

public class ResultErrorException extends RuntimeException {

    String currentResult;
    String expectResult;

    public ResultErrorException(String currentResult, String expectResult) {
        super("预期结果为: " + expectResult + " 而当前结果为: " + currentResult);
        this.currentResult = currentResult;
        this.expectResult = expectResult;

    }
}
