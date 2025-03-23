package com.toki.hatchsimulator.validator;

import com.toki.hatchsimulator.exception.error.CommonErrorCode;
import com.toki.hatchsimulator.exception.error.Error;

public class UserInputValidator {

    public static void integerValidate(final String userInput) {

    }

    public static void rangeValidate(final int userInput, final int start, final int end) {

    }

    public static void nonBlankValidate(final String userInput) {
        /* https://hianna.tistory.com/531
         * isBlank() : 공백이거나 스페이스바만으로 이뤄진 경우 true 리턴 */
        if (userInput == null || userInput.isBlank()) {
//            throw new CommonErrorCode("NULL_INPUT_ERROR")
        }
    }
}
