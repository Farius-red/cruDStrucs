package co.com.siscomputo.crud.dsp;

import co.com.siscomputo.DAO.CrearDAO;
import co.com.siscomputo.crud.forms.CrudForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class CrudDsp extends DispatchAction {

    public ActionForward insertar(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        try {
            CrudForm crudForm = (CrudForm) form;
            CrearDAO creardao = new CrearDAO();
            crudForm.setAction(1);

            creardao.insert();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("listar");
    }

    public ActionForward actualizar(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        try {
            CrudForm crudForm = (CrudForm) form;
            CrearDAO creardao = new CrearDAO();
            crudForm.setAction(2);
        } catch (Exception e) {
          
            e.printStackTrace();
              return mapping.findForward("listar");
        }
        return mapping.findForward("listar");
    }

    public ActionForward eliminar(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        try {
            CrudForm crudForm = (CrudForm) form;
            CrearDAO creardao = new CrearDAO();
            crudForm.setAction(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("listar");
    }
}
