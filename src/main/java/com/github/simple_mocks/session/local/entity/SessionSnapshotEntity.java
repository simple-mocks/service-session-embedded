package com.github.simple_mocks.session.local.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "session_snapshot")
public class SessionSnapshotEntity {
    @EmbeddedId
    private SessionSnapshotEntityId entityId;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "uid", nullable = false, insertable = false, updatable = false)
    private SessionEntity session;
    @Column(name = "snapshot", nullable = false)
    private byte[] snapshot;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "snapshot_ser_type", nullable = false)
    private SnapshotCodecType snapshotType;
    @Column(name = "created_at", nullable = false)
    private ZonedDateTime createdAt;
}
