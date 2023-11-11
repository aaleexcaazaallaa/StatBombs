package es.iesjandula.statbombs.parse_write_utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import es.iesjandula.statbombs.exceptions.StatbombsException;
import es.iesjandula.statbombs.utils.Competition;

public class ParseCompetitionsXml
{
	public List<Competition> parseCompetitions(String path) throws StatbombsException
	{
		final Logger logger = LogManager.getLogger();
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

		List<Competition> competitions = new ArrayList<Competition>();

		try
		{
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

			Document document = documentBuilder.parse(new File(path));

			Element rootElement = document.getDocumentElement();

			NodeList nodeListCompetitions = rootElement.getElementsByTagName("competition");

			int competition_id = 0;
			int season_id = 0;
			String competition_name = "";
			String competition_gender = "";
			boolean competition_youth = false;
			boolean competition_international = false;
			String country_name = "";
			String season_name = "";
			String match_updated = "";
			String match_updated_360 = "";
			String match_available_360 = "";
			String match_available = "";
			Competition competition = null;

			for (int i = 0; i < nodeListCompetitions.getLength(); i++)
			{
				Element nodeCompetition = (Element) nodeListCompetitions.item(i);

				competition_id = Integer.valueOf(nodeCompetition.getElementsByTagName("competition_id").item(0).getTextContent());
				season_id = Integer.valueOf(nodeCompetition.getElementsByTagName("season_id").item(0).getTextContent());
				competition_name = String.valueOf(nodeCompetition.getElementsByTagName("competition_name").item(0).getTextContent());
				competition_gender = String.valueOf(nodeCompetition.getElementsByTagName("competition_gender").item(0).getTextContent());
				competition_youth = Boolean.valueOf(nodeCompetition.getElementsByTagName("competition_youth").item(0).getTextContent());
				competition_international = Boolean.valueOf(nodeCompetition.getElementsByTagName("competition_international").item(0).getTextContent());
				country_name = String.valueOf(nodeCompetition.getElementsByTagName("country_name").item(0).getTextContent());
				season_name = String.valueOf(nodeCompetition.getElementsByTagName("season_name").item(0).getTextContent());
				match_updated = String.valueOf(nodeCompetition.getElementsByTagName("match_updated").item(0).getTextContent());
				match_updated_360 = String.valueOf(nodeCompetition.getElementsByTagName("match_updated_360").item(0).getTextContent());
				match_available_360 = String.valueOf(nodeCompetition.getElementsByTagName("match_available_360").item(0).getTextContent());
				match_available = String.valueOf(nodeCompetition.getElementsByTagName("match_available").item(0).getTextContent());

				competition = new Competition(competition_id, season_id, competition_name, competition_gender, competition_youth, competition_international, country_name, season_name, match_updated, match_updated_360, match_available_360, match_available);
				competitions.add(competition);
			}
		}
		catch (ParserConfigurationException exception)
		{
			String error = "Error with the file";
			logger.error(error, exception);
			throw new StatbombsException(error, exception);
		} 
		catch (SAXException exception)
		{
			String error = "Error with XML";
			logger.error(error, exception);
			throw new StatbombsException(error, exception);
		} 
		catch (IOException exception)
		{
			String error = "Error while reading";
			logger.error(error, exception);
			throw new StatbombsException(error, exception);
		}
		
		return competitions;
	}
}
