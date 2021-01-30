package br.edu.iftm.os.bean.converter;

import br.edu.iftm.os.model.Cliente;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
/**
 *
 * @author Trabalho luiz fernando
 */
@FacesConverter(forClass = Cliente.class)
public class ClienteConverter implements Converter {

    @Override
    public Cliente getAsObject(FacesContext fc, UIComponent uic, String id) {
        if (id != null && !"".equals(id)) {
            Cliente cliente = (Cliente) uic.getAttributes().get("cliente_" + id);
            return cliente;
        }
        System.out.println("Permissao: " + id);
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
        if (obj == null || !(obj instanceof Cliente)) {
            return "";
        }
        Cliente cliente = (Cliente) obj;
        if (cliente.getId() != null) {
            uic.getAttributes().put("cliente_" + cliente.getId(), cliente);
            return cliente.getId().toString();
        }
        return "";
    }

}
