package com.ae.teams.controller

import com.ae.teams.entity.TeamEntity
import com.ae.teams.service.TeamService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teams")
class TeamController {

    @Autowired
    lateinit var service: TeamService

    /**
     * Get list of teams
     */
    @GetMapping
    fun getTeams(): ResponseEntity<List<TeamEntity>> {
        return ResponseEntity(service.getTeams(), HttpStatus.OK)
    }

    /**
     * Get team by Entity
     */
    @GetMapping(value = ["/name/{name}"])
    fun getTeamByName(@PathVariable name: String): ResponseEntity<TeamEntity> {
        return ResponseEntity(service.getTeamByName(name), HttpStatus.OK)
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
    fun updateTeam(@RequestBody teamEntity: TeamEntity): ResponseEntity<TeamEntity> {
        return ResponseEntity(service.updateTeam(teamEntity), HttpStatus.OK)
    }
}