package modelo;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Modelo.Proveedor;

public class TablaModeloProveedor extends AbstractTableModel {
	
	private String []columnNames={"Id","Nombre","Telefono","Celular","Direccion"};
	private List<Proveedor> proveedores = new ArrayList<Proveedor>();
	
	
	public void agregarProveedor(Proveedor proveedor) {
		proveedores.add(proveedor);
        fireTableDataChanged();
    }
	
	public Proveedor getProveedor(int index){
		//proveedores.
		return proveedores.get(index);
		
	}
	
	public void cambiarProveedor(int index,Proveedor proveedor){
		proveedores.set(index, proveedor);
	}
 
    public void eliminarProveedor(int rowIndex) {
    	proveedores.remove(rowIndex);
        fireTableDataChanged();
    }
     
    public void limpiarClientes() {
    	proveedores.clear();
        fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return proveedores.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
        case 0:
            return proveedores.get(rowIndex).();
        case 1:
            return proveedores.get(rowIndex).getNombre();
        case 2:
            return proveedores.get(rowIndex).getTelefono();
        case 3:
            return proveedores.get(rowIndex).getCelular();
        case 4:
            return proveedores.get(rowIndex).getDireccion();
        default:
            return null;
		}
	}
	
	@Override
    public Class getColumnClass(int columnIndex) {
		//        return getValueAt(0, columnIndex).getClass();
        return String.class;
    }
	
	@Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
	
	 @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	        Proveedor proveedor = proveedores.get(rowIndex);
	        switch (columnIndex) {
	            case 0:
	            	proveedor.setId((Integer) value);
	            case 1:
	            	proveedor.setNombre((String) value);
	            case 2:
	            	proveedor.setTelefono((String) value);
	            case 3:
	            	proveedor.setCelular((String) value);
	            case 4:
	            	proveedor.setDireccion((String) value);
	        }
	        fireTableCellUpdated(rowIndex, columnIndex);
	    }
 

}
