/*
* The MIT License
* 
* Copyright: Copyright (C) 2014 T2Ti.COM
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
* 
* The author may be contacted at: t2ti.com@gmail.com
*
* @author Claudio de Barros (T2Ti.com)
* @version 2.0
*/
package adm.com.jumbo.cadastros.cliente;

import adm.com.jumbo.cadastros.java.PessoaVO;
import java.util.ArrayList;
import java.util.Map;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import org.openswing.swing.util.java.Consts;

public class PessoaTelefoneGridController extends GridController implements GridDataLocator {

    private PessoaDetalhe pessoaDetalhe;
    private PessoaVO pessoa;

    public PessoaTelefoneGridController(PessoaDetalhe pessoaDetalhe) {
        this.pessoaDetalhe = pessoaDetalhe;
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        if (pessoa != null && pessoa.getListaTelefone() != null) {
            return new VOListResponse(pessoa.getListaTelefone(), false, pessoa.getListaTelefone().size());
        } else {
            return new VOListResponse();
        }
    }

    @Override
    public boolean beforeInsertGrid(GridControl grid) {
        if (pessoaDetalhe.getForm1().getMode() == Consts.READONLY) {
            pessoaDetalhe.getForm1().setMode(Consts.EDIT);
        }
        return true;
    }

    @Override
    public Response insertRecords(int[] rowNumbers, ArrayList newValueObjects) throws Exception {
        return new VOListResponse(newValueObjects, false, newValueObjects.size());
    }

    @Override
    public boolean beforeEditGrid(GridControl grid) {
        if (pessoaDetalhe.getForm1().getMode() == Consts.READONLY) {
            pessoaDetalhe.getForm1().setMode(Consts.EDIT);
        }
        return true;
    }

    @Override
    public Response updateRecords(int[] rowNumbers, ArrayList oldPersistentObjects, ArrayList persistentObjects) throws Exception {
        return new VOListResponse(persistentObjects, false, persistentObjects.size());
    }

    @Override
    public boolean beforeDeleteGrid(GridControl grid) {
        if (pessoaDetalhe.getForm1().getMode() == Consts.READONLY) {
            pessoaDetalhe.getForm1().setMode(Consts.EDIT);
        }
        return true;
    }

    @Override
    public Response deleteRecords(ArrayList persistentObjects) throws Exception {
        return new VOListResponse(persistentObjects, false, persistentObjects.size());
    }

    public void setPessoa(PessoaVO pessoa) {
        this.pessoa = pessoa;
    }
}
