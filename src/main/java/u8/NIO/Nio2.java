package u8.NIO;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;


public class Nio2 {
        String HOME = System.getProperty("user.home");

    @Test
    public void givenExistentPath_whenConfirmsFileExists_thenCorrect() {
        //file exists
        Path p = Paths.get(HOME);
        assertTrue(Files.exists(p));

        //file doesn't exist
        Path pe = Paths.get(HOME + "/inexistent_file.txt");
        assertTrue(Files.notExists(pe));

        Path pee = Paths.get(HOME);
        assertTrue(Files.isReadable(p));
    }
    @Test
    public void givenExistentDirPath_whenConfirmsWritable_thenCorrect() {
        Path p = Paths.get(HOME);
        assertTrue(Files.isWritable(p));
    }
    @Test
    public void givenExistentDirPath_whenConfirmsExecutable_thenCorrect() {
        Path p = Paths.get(HOME);
        assertTrue(Files.isExecutable(p));
    }
    @Test
    public void givenSameFilePaths_whenConfirmsIsSame_thenCorrect() throws IOException {
        Path p1 = Paths.get(HOME);
        Path p2 = Paths.get(HOME);

        assertTrue(Files.isSameFile(p1, p2));
    }
    @Test
    public void givenFilePath_whenCreatesNewFile_thenCorrect() throws IOException {
        String fileName = "myfile_" + UUID.randomUUID().toString() + ".txt";
        Path p = Paths.get(HOME + "/" + fileName);
        assertFalse(Files.exists(p));

        Files.createFile(p);

        assertTrue(Files.exists(p));
    }
    @Test
    public void givenDirPath_whenCreatesNewDir_thenCorrect() throws IOException {
        String dirName = "myDir_" + UUID.randomUUID().toString();
        Path p = Paths.get(HOME + "/" + dirName);
        assertFalse(Files.exists(p));

        Files.createDirectory(p);

        assertTrue(Files.exists(p));
        assertFalse(Files.isRegularFile(p));
        assertTrue(Files.isDirectory(p));
    }
    @Test
    public void givenPath_whenDeletes_thenCorrect() throws IOException {
        Path p = Paths.get(HOME + "/fileToDelete.txt");
        assertFalse(Files.exists(p));
        Files.createFile(p);
        assertTrue(Files.exists(p));

        Files.delete(p);

        assertFalse(Files.exists(p));
    }

}
