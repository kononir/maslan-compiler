package com.bsuir.maslan.util;

import javax.swing.*;
import java.util.List;

public class ErrorsShower {

    public void showErrors(List<String> errors) {
        StringBuilder error = new StringBuilder();
        if (errors.size() > 0) {
            errors.forEach(err -> error.append(err).append("\n"));
            JOptionPane.showMessageDialog(null, error.toString());
        }
    }
}
