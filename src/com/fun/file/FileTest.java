package com.fun.file;

import java.io.*;

/**
 * Created by fun on 16/8/22.
 */
public class FileTest {

    private File f;

    public FileTest() {
        String path = "data/print.txt";
        this.f = new File(path);
        filesOutput();
        fileGetPath();
        fileGetAbsolutePath();
    }

    /**
     * print files in root Folder
     */
    public void filesOutput() {
        File path = new File("./");
        String[] content = path.list();
        for (int i=0;i<content.length;i++) {
            System.out.println(content[i]);
        }
    }

    /**
     * fet file Path
     */
    public void fileGetPath() {
        System.out.println(this.f.getPath());
    }

    /**
     * get file absolute path
     */
    public void fileGetAbsolutePath() {
        System.out.println(this.f.getAbsolutePath());
    }

    /**
     * output file content by line
     * @throws IOException
     */
    public void fileRead() throws IOException {
        InputStreamReader read = new InputStreamReader(new FileInputStream(f));
        BufferedReader bufferedReader = new BufferedReader(read);
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        read.close();
    }

}
