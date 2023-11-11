package es.iesjandula.statbombs.utils;

public class Competition
{
	private int competition_id;
	
	private int season_id;
	
	private String competition_name;
	
	private String competition_gender;
	
	private boolean competition_youth;

	private boolean competition_international;
	
	private String country_name;
	
	private String season_name;
	
	private String match_updated;
	
	private String match_updated_360;
	
	private String match_available_360;
	
	private String match_available;
	

	public Competition(int competition_id, int season_id, String competition_name, String competition_gender, boolean competition_youth,
			boolean competition_international, String country_name, String season_name, String match_updated, String match_updated_360,
			String match_available, String match_available_360)
	{
		this.competition_id = competition_id;
		this.season_id = season_id;
		this.competition_name = competition_name;
		this.competition_gender = competition_gender;
		this.competition_youth = competition_youth;
		this.competition_international = competition_international; 
		this.country_name = country_name;
		this.season_name = season_name;
		this.match_updated = match_updated;
		this.match_updated_360 = match_updated_360;
		this.match_available = match_available;
		this.match_available_360 = match_available_360;
	}

	/**
	 * @return the competition_id
	 */
	public int getCompetition_id()
	{
		return this.competition_id;
	}

	/**
	 * @param competition_id the competition_id to set
	 */
	public void setCompetition_id(int competition_id)
	{
		this.competition_id = competition_id;
	}

	/**
	 * @return the season_id
	 */
	public int getSeason_id()
	{
		return this.season_id;
	}

	/**
	 * @param season_id the season_id to set
	 */
	public void setSeason_id(int season_id)
	{
		this.season_id = season_id;
	}

	/**
	 * @return the competition_name
	 */
	public String getCompetition_name()
	{
		return this.competition_name;
	}

	/**
	 * @param competition_name the competition_name to set
	 */
	public void setCompetition_name(String competition_name)
	{
		this.competition_name = competition_name;
	}

	/**
	 * @return the competition_gender
	 */
	public String getCompetition_gender()
	{
		return this.competition_gender;
	}

	/**
	 * @param competition_gender the competition_gender to set
	 */
	public void setCompetition_gender(String competition_gender)
	{
		this.competition_gender = competition_gender;
	}
	
	/**
	 * @return the competition_youth
	 */
	public boolean isCompetition_youth()
	{
		return competition_youth;
	}

	/**
	 * @param competition_youth the competition_youth to set
	 */
	public void setCompetition_youth(boolean competition_youth)
	{
		this.competition_youth = competition_youth;
	}

	/**
	 * @return the competition_international
	 */
	public boolean isCompetition_international()
	{
		return competition_international;
	}

	/**
	 * @param competition_international the competition_international to set
	 */
	public void setCompetition_international(boolean competition_international)
	{
		this.competition_international = competition_international;
	}

	/**
	 * @return the country_name
	 */
	public String getCountry_name()
	{
		return this.country_name;
	}

	/**
	 * @param country_name the country_name to set
	 */
	public void setCountry_name(String country_name)
	{
		this.country_name = country_name;
	}

	/**
	 * @return the season_name
	 */
	public String getSeason_name()
	{
		return this.season_name;
	}

	/**
	 * @param season_name the season_name to set
	 */
	public void setSeason_name(String season_name)
	{
		this.season_name = season_name;
	}

	/**
	 * @return the match_updated
	 */
	public String getMatch_updated()
	{
		return this.match_updated;
	}

	/**
	 * @param match_updated the match_updated to set
	 */
	public void setMatch_updated(String match_updated)
	{
		this.match_updated = match_updated;
	}

	/**
	 * @return the match_updated_360
	 */
	public String getMatch_updated_360()
	{
		return this.match_updated_360;
	}

	/**
	 * @param match_updated_360 the match_updated_360 to set
	 */
	public void setMatch_updated_360(String match_updated_360)
	{
		this.match_updated_360 = match_updated_360;
	}

	/**
	 * @return the match_available
	 */
	public String getMatch_available()
	{
		return this.match_available;
	}

	/**
	 * @param match_available the match_available to set
	 */
	public void setMatch_available(String match_available)
	{
		this.match_available = match_available;
	}

	/**
	 * @return the match_available_360
	 */
	public String getMatch_available_360()
	{
		return this.match_available_360;
	}

	/**
	 * @param match_available_360 the match_available_360 to set
	 */
	public void setMatch_available_360(String match_available_360)
	{
		this.match_available_360 = match_available_360;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Competition [competition_id=");
		builder.append(competition_id);
		builder.append(", season_id=");
		builder.append(season_id);
		builder.append(", competition_name=");
		builder.append(competition_name);
		builder.append(", competition_gender=");
		builder.append(competition_gender);
		builder.append(", competition_youth=");
		builder.append(competition_youth);
		builder.append(", competition_international=");
		builder.append(competition_international);
		builder.append(", country_name=");
		builder.append(country_name);
		builder.append(", season_name=");
		builder.append(season_name);
		builder.append(", match_updated=");
		builder.append(match_updated);
		builder.append(", match_updated_360=");
		builder.append(match_updated_360);
		builder.append(", match_available_360=");
		builder.append(match_available_360);
		builder.append(", match_available=");
		builder.append(match_available);
		builder.append("]\n");
		return builder.toString();
	}
	
}
