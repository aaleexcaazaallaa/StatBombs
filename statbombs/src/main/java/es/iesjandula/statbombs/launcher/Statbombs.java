package es.iesjandula.statbombs.launcher;

import es.iesjandula.statbombs.exceptions.StatbombsException;
import es.iesjandula.statbombs.parse_write_utils.WriteCompetitionData;

public class Statbombs
{
	public static void main(String[] args) throws StatbombsException
	{
		WriteCompetitionData writeCompetitions = new WriteCompetitionData();
		writeCompetitions.writeCompetitions();
	}
}
