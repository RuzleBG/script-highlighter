package com.mh.script_coloring;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoleConverter {
    public static List<String> getActors(String text){

        String regex = "\\b[A-Z]+(?:\\s[A-Z]+|\\.[A-Z]+)*(?=:)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> parts = new ArrayList<>();
        int lastEnd = 0;

        while (matcher.find()) {
            if(!parts.contains(matcher.group()) && !matcher.group().equals("SCENE"))
                parts.add(matcher.group());

        }

        List<String> uniqueRoles = new ArrayList<>();
        boolean contains;
        for(int i=0; i<parts.size(); i++){
            contains=false;
            for(int j=i+1; j<parts.size(); j++){
                if (parts.get(j).replace("\\s+", "").contains(parts.get(i).replaceAll("\\s+", ""))) {
                    contains = true;
                    break;
                }
            }
            if(!contains){
                uniqueRoles.add(parts.get(i));
            }
        }

        return uniqueRoles;
    }
}
