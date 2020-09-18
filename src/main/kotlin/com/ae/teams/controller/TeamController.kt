package com.ae.teams.controller

import com.ae.teams.dto.TeamResponse
import com.ae.teams.entity.TeamEntity
import com.ae.teams.service.TeamService
import com.ae.teams.util.toTeamResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teams")
class TeamController(@Autowired val service: TeamService) {

    /**
     * Get list of teams
     */
    @GetMapping
    fun getTeams(): ResponseEntity<List<TeamResponse>> {
        val teams: List<TeamEntity> = service.getTeams()
        return ResponseEntity(teams.toTeamResponse(teams), HttpStatus.OK)
    }

    /**
     * Get team by Entity
     */
    @GetMapping(value = ["/name/{name}"])
    fun getTeamByName(@PathVariable name: String): ResponseEntity<TeamResponse> {
        val team: TeamEntity = service.getTeamByName(name)
        return ResponseEntity(team.toTeamResponse(), HttpStatus.OK)
    }

    /**
     * Save team
     */
    @PostMapping
    fun saveTeam(@RequestBody teamEntity: TeamEntity): ResponseEntity<TeamEntity> {
        return ResponseEntity(service.saveTeam(teamEntity), HttpStatus.CREATED)
    }

    /**
     * Update team
     */
    @PutMapping
    fun updateTeam(@RequestBody teamEntity: TeamEntity): ResponseEntity<TeamResponse> {
        val team: TeamEntity = service.getTeamByName(teamEntity.name)
        return ResponseEntity(team.toTeamResponse(), HttpStatus.OK)
    }
}