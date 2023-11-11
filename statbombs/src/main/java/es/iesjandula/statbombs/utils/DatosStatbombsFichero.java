package es.iesjandula.statbombs.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.iesjandula.statbombs.exceptions.StatbombsException;

public class DatosStatbombsFichero
{
	public void meterInfo(String info) throws StatbombsException
	{
		final Logger logger = LogManager.getLogger();
		
		File file = new File("competiciones.txt");
		FileWriter fw = null;

		try
		{
			fw = new FileWriter(file);
			fw.write(info);
			fw.flush();
		} 
		catch (IOException exception)
		{
			String error = "Error while reading";
			logger.error(error, exception);
			throw new StatbombsException(error, exception);
		} 
		finally
		{
			if (fw != null)
			{
				try
				{
					fw.close();
				} 
				catch (IOException exception)
				{
					String error = "Error ewhile reading";
					logger.error(error, exception);
					throw new StatbombsException(error, exception);
				}
			}
		}
	}
}
