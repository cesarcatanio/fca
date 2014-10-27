package grafo.diagram.edit.parts;

import grafo.Enlace;
import grafo.diagram.edit.policies.EnlaceItemSemanticEditPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated NOT
 */
public class EnlaceEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public EnlaceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EnlaceItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new EnlaceFigure(this);
	}

	/**
	 * @generated
	 */
	public EnlaceFigure getPrimaryShape() {
		return (EnlaceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EnlaceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		//	private  fFigureNull; 

		/**
		 * @generated
		 */
		public EnlaceFigure(EnlaceEditPart edit) {
			try {
				EnlaceEditPart e;
				Enlace model= null;
				if(edit instanceof EnlaceEditPart){
					e=(EnlaceEditPart)edit;
					model=(Enlace)e.resolveSemanticElement();
				}
				
				String nombre=model.getNombre();
				
				if(nombre.equals("1"))
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.red);
					this.setLineWidth(Integer.parseInt(nombre));
				}
				else if(nombre.equals("2"))
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.blue);
					this.setLineWidth(Integer.parseInt(nombre));
				}
				else if(nombre.equals("3"))
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.cyan);
					this.setLineWidth(Integer.parseInt(nombre));
				}
				else if(nombre.equals("4"))
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.green);
					this.setLineWidth(Integer.parseInt(nombre));
				}
				else if(nombre.equals("5"))
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.orange);
					this.setLineWidth(Integer.parseInt(nombre));
				}
				else if(nombre.equals("a"))
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.red);
					this.setLineWidth(4);
				}
				else if(nombre.equals("="))
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.orange);
					this.setLineWidth(4);
				}
				else if(nombre.equals("b"))
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.blue);
					this.setLineWidth(4);
				}
				else
				{
					this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black);
					this.setLineWidth(1);
				}
				
				
				setTargetDecoration(createTargetDecoration());
				
			} catch (Exception e) {
				
				this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black);
				setTargetDecoration(createTargetDecoration());
				
			}
			
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-2));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

			/**
			 * @generated
			 */
		//	public  getFigureNull() {
		//		return fFigureNull;
		//	}

	}

}
