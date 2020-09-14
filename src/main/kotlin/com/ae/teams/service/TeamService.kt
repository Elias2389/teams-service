package com.ae.teams.service

import com.ae.teams.entity.TeamEntity

interface TeamService {

    /**
     * Get list of teams
     */
    fun getTeams(): List<TeamEntity>

    /**
     * Get team by Entity
     */
    fun getTeamByName(name: String): TeamEntity

    /**
     * Save team
     */
    fun saveTeam(teamEntity: TeamEntity): TeamEntity

    /**
     * Update team
     */
    fun updateTeam(teamEntity: TeamEntity): TeamEntity
}