package com.sonsure.commons.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证结果
 *
 */
public class ValidationResult {

    /**
     * 是否成功
     */
    private boolean               isSuccess;

    /**
     * 验证错误
     */
    private List<ValidationError> errors;

    public ValidationResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * 添加错误
     *
     * @param error 错误
     */
    public void addError(ValidationError error) {
        if (errors == null) {
            errors = new ArrayList<ValidationError>();
        }
        errors.add(error);
    }

    public List<ValidationError> getErrors() {
        return errors;
    }

    //    public int getTimeElapsed() {
    //        return timeElapsed;
    //    }
    //
    //    public void setTimeElapsed(int timeElapsed) {
    //        this.timeElapsed = timeElapsed;
    //    }
}
