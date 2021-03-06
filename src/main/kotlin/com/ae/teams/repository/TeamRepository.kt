package com.ae.teams.repository

import com.ae.teams.entity.TeamEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TeamRepository: JpaRepository<TeamEntity, Long> {

    /**
     * Find team by name
     */
    fun findTeamEntityByName(name: String): Optional<TeamEntity>
}