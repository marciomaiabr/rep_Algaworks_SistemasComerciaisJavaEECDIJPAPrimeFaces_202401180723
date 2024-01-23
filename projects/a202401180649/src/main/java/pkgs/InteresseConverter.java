package pkgs;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("mmConverterInteresse")
public class InteresseConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("InteresseConverter.getAsObject()");
		System.out.println("[value="+value+"]");
		if(value != null) {
			for(Interesse interesse : Teste01MB.INTERESSES) {
				if(value.equals(interesse.getNomeIcone())) {
					return interesse;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		System.out.println("InteresseConverter.getAsString()");
		System.out.println("[value="+value+"]");
		if(value != null) {
			Interesse interesse = (Interesse) value;
			return interesse.getNomeIcone();
		}
		return null;
	}

}
