package br.com.offices.repository

import br.com.offices.domain.office.Point
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface PointRepository : JpaRepository<Point, UUID> {
}