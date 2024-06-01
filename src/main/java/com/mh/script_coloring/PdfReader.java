package com.mh.script_coloring;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfReader {

    private static final String FILE_PATH = "C:\\Users\\kiril\\Desktop\\pdf\\blank\\Bald_Soprano.pdf";
    public static String readPdf(String filePath) throws IOException {
        PDDocument document = PDDocument.load(new File(FILE_PATH));
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);
        document.close();
        return text;
    }
}
