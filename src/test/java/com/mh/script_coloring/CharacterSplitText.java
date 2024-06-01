package com.mh.script_coloring;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CharacterSplitText {
    
    @Test
    public void testCharacterSplit() throws IOException {
        System.out.println(RoleConverter.getActors(PdfReader.readPdf("")));
    }
}
