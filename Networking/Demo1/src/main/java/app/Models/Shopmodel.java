package app.Models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Shopmodel {
    private Iteminfo[] items;

    // public Shopmodel() {
    //     items = load("Met.store");
    // }

    public static void save(String document , Iteminfo[] entry) {
        var serial = new ObjectMapper();
        try(var output  = new FileOutputStream(document)) {
            serial.writeValue(output , entry);
        }catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    // public static void load(String document) {
    //     var serial = new ObjectMapper();
    //     try()
    // }


}