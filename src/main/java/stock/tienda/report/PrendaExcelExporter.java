package stock.tienda.report;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import stock.tienda.model.Prenda;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PrendaExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    private List<Prenda> listaPrendas;

    public PrendaExcelExporter(List<Prenda> listaPrendas) {
        this.listaPrendas = listaPrendas;
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Prendas");
    }

    private void writeHeaderRow() {
        Row row = sheet.createRow(0);

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);

        Cell cell = row.createCell(0);
        cell.setCellValue("Prenda Id");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue("Nombre");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("PrecioCompra");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("PrecioVenta");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("Detalle");
        cell.setCellStyle(style);

        cell = row.createCell(5);
        cell.setCellValue("Temporada");
        cell.setCellStyle(style);

        cell = row.createCell(6);
        cell.setCellValue("Talle");
        cell.setCellStyle(style);

        cell = row.createCell(7);
        cell.setCellValue("Color");
        cell.setCellStyle(style);

        cell = row.createCell(8);
        cell.setCellValue("PorcentajeUtilidad");
        cell.setCellStyle(style);
    }

    private void wrtiteDataRows() {
        int rowCount = 1;
        for (Prenda prenda : listaPrendas) {
            Row row = sheet.createRow(rowCount++);

            Cell cell = row.createCell(0);
            cell.setCellValue(prenda.getId());

            cell = row.createCell(1);
            cell.setCellValue(prenda.getNombre());

            cell = row.createCell(2);
            cell.setCellValue(prenda.getPrecioCompra());

            cell = row.createCell(3);
            cell.setCellValue(prenda.getPrecioVenta());

            cell = row.createCell(4);
            cell.setCellValue(prenda.getDetalle());

            cell = row.createCell(5);
            cell.setCellValue(prenda.getTemporada());

            cell = row.createCell(6);
            cell.setCellValue(prenda.getTalle());

            cell = row.createCell(7);
            cell.setCellValue(prenda.getColor());

            cell = row.createCell(8);
            cell.setCellValue(prenda.getPorcentajeUtilidad());
        }
    }

    public void export(HttpServletResponse response) throws IOException {
        writeHeaderRow();
        wrtiteDataRows();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }


}
