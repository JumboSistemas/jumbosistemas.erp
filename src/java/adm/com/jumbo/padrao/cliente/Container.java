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
package adm.com.jumbo.padrao.cliente;

import adm.com.jumbo.cadastros.java.EmpresaEnderecoVO;
import adm.com.jumbo.cadastros.java.UsuarioVO;
import java.util.Hashtable;

public class Container {

    //objeto utilizado para armazenar dados da aplicação do lado cliente
    private static Hashtable container = new Hashtable();
    public static boolean tresCamadas = true;

    public static Hashtable getContainer() {
        return container;
    }

    public static void setContainer(UsuarioVO usuarioVO) {
        container.put("usuario", usuarioVO);
        container.put("empresa", usuarioVO.getColaborador().getPessoa().getListaEmpresa().get(0));
        EmpresaEnderecoVO enderecoPrincipalEmpresa = new EmpresaEnderecoVO();
        for (EmpresaEnderecoVO endereco : usuarioVO.getColaborador().getPessoa().getListaEmpresa().get(0).getListaEndereco()) {
            if (endereco.getPrincipal().equals("S")) {
                enderecoPrincipalEmpresa = endereco;
            }
        }
        container.put("enderecoPrincipalEmpresa", enderecoPrincipalEmpresa);
    }
}
