package dct25.trs80;

import static org.junit.Assert.*;

import org.junit.Test;

import beaver.Symbol;

import dct25.trs80.syntaxTree.ClearScreenStatement;
import dct25.trs80.syntaxTree.LineNumber;
import dct25.trs80.syntaxTree.Program;
import dct25.trs80.syntaxTree.ProgramLine;
import dct25.trs80.syntaxTree.Statement;

public class ProgramToBasic {

    @Test
    public void ShouldConvertCLSToBasicCorrectly() {

        Program p = new Program(
                new ProgramLine[] { new ProgramLine(new LineNumber(null), new Statement[] {
                    new ClearScreenStatement()
                })});

        assertEquals("Check program text", "10 CLS\n", p.asBasic());
    }

}
