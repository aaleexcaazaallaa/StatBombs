package es.iesjandula.statbombs.parse_write_utils;

import java.util.ArrayList;
import java.util.List;

import es.iesjandula.statbombs.exceptions.StatbombsException;
import es.iesjandula.statbombs.utils.Competition;
import es.iesjandula.statbombs.utils.DatosStatbombsFichero;

public class WriteCompetitionData
{
	public void writeCompetitions() throws StatbombsException
	{
		DatosStatbombsFichero datosStatbombsFichero = new DatosStatbombsFichero();

		String infoParaFichero = "";
		
		ParseCompetitionsXml parseCompetitions = new ParseCompetitionsXml();
		List<Competition> competitions = parseCompetitions.parseCompetitions("competitions.xml");
		
		infoParaFichero += "Nombre de las competiciones femeninas: \n";
		List<String> femaleCompetitions = new ArrayList<String>();
		for (Competition x : competitions)
		{
			if (x.getCompetition_gender().equals("female"))
			{
				if(!femaleCompetitions.contains(x.getCompetition_name())) 
				{
					femaleCompetitions.add(x.getCompetition_name());
				}
			}
		}
		infoParaFichero += femaleCompetitions;
		
		infoParaFichero += "\n \nNombre de las competiciones que se realicen en Europa y sean internacionales: \n";
		List<String> europeInternationalCompetitions = new ArrayList<String>();
		for (Competition x : competitions)
		{
			if (x.getCountry_name().equals("Europe") && x.isCompetition_international() == true)
			{
				if(!europeInternationalCompetitions.contains(x.getCompetition_name())) 
				{
					europeInternationalCompetitions.add(x.getCompetition_name());
				}
			}
		}
		infoParaFichero += europeInternationalCompetitions;
		
		infoParaFichero += "\n \nNombre de las competiciones que se realicen en Europa y sean internacionales: \n";
		List<String> available360Competitions = new ArrayList<String>();
		for (Competition x : competitions)
		{
			if (!x.getMatch_available_360().equals(null))
			{
				if(!available360Competitions.contains(x.getCompetition_name())) 
				{
					available360Competitions.add(x.getCompetition_name());
				}
			}
		}
		infoParaFichero += available360Competitions;

		datosStatbombsFichero.meterInfo(infoParaFichero);

	}
}
