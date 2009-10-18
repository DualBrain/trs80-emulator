package dct25.trs80.emulator;

import static org.junit.Assert.*;

import org.junit.Test;

import dct25.trs80.examplePrograms.SingleClearScreenProgram;
import dct25.trs80.syntaxTree.ClearScreenStatement;
import dct25.trs80.syntaxTree.LineNumber;
import dct25.trs80.syntaxTree.Program;

public class ClearScreenTest {
    @Test
    public void shouldClearScreen() {
        InstrumentedEnvironment env = new InstrumentedEnvironment();
        
        assertFalse("Should not have cleared screen", env.getScreenCleared());
        Executable e = new SingleClearScreenProgram();
        e.execute(env);
        assertTrue("Should now have cleared screen", env.getScreenCleared());
    }

    @Test
    public void shouldClearScreenWithInMemoryClass() throws Exception {
        Program clearScreenProgram = new Program(new LineNumber(null), new ClearScreenStatement());
        Executable e = clearScreenProgram.compile();

        InstrumentedEnvironment env = new InstrumentedEnvironment();
        assertFalse("Should not have cleared screen", env.getScreenCleared());
        e.execute(env);
        assertTrue("Should now have cleared screen", env.getScreenCleared());
    }
}
