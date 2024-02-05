package pkgs;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Pais.class)
public class PaisConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null) {
			Integer codigo = Integer.valueOf(value);

			for(Pais pais : Teste01MB.PAISES) {
				if(codigo.equals(pais.getCodigo())) {
					return pais;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null) {
			Pais pais = (Pais) value;
			return pais.getCodigo().toString();
		}
		return null;
	}

}
