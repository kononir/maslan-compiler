package com.bsuir.maslan.util;

import com.bsuir.maslan.util.exception.WritingFilesException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResultWriter {
    private static final String RESULT_FILE_PATH = "result/src/Result.java";

    public void writeResult(String code) throws WritingFilesException {
        try {
            File file = new File(RESULT_FILE_PATH);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(code);
            fileWriter.close();
        } catch (IOException e) {
            throw new WritingFilesException("Writing error.", e);
        }
    }
}
