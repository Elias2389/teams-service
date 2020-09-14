package com.ae.teams.service

import com.ae.teams.entity.TeamEntity
import com.ae.teams.repository.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TeamServiceImpl: TeamService {

    @Autowired
    lateinit var repository: TeamRepository


    override fun getTeams(): List<TeamEntity> {
        return repository.findAll()
    }

    override fun getTeamByName(name: String): TeamEntity {
        return repository.findTeamEntityByName(name)
    }

    override fun saveTeam(teamEntity: TeamEntity): TeamEntity {
        return repository.save(teamEntity)
    }

    override fun updateTeam(teamEntity: TeamEntity): TeamEntity {
        return repository.save(teamEntity)
    }

}