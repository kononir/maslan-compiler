package com.bsuir.maslan.lang.util;

import java.util.List;

public class FunctionSignature {
    private String name;
    private String returnType;
    private List<String> parameterTypes;

    public FunctionSignature(String name, String returnType, List<String> parameterTypes) {
        this.name = name;
        this.returnType = returnType;
        this.parameterTypes = parameterTypes;
    }

    public String getName() {
        return name;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<String> getParameterTypes() {
        return parameterTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FunctionSignature that = (FunctionSignature) o;
        return name.equals(that.name) &&
                returnType.equals(that.returnType) &&
                parameterTypes.equals(that.parameterTypes);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + returnType.hashCode() + parameterTypes.hashCode();
    }
}
