package com.github.mauricio.async.db.postgresql.codec

import com.github.mauricio.async.db.postgresql.messages.backend.AuthenticationMessage
import com.github.mauricio.async.db.postgresql.messages.backend.CommandCompleteMessage
import com.github.mauricio.async.db.postgresql.messages.backend.DataRowMessage
import com.github.mauricio.async.db.postgresql.messages.backend.ErrorMessage
import com.github.mauricio.async.db.postgresql.messages.backend.NotificationResponse
import com.github.mauricio.async.db.postgresql.messages.backend.ParameterStatusMessage
import com.github.mauricio.async.db.postgresql.messages.backend.RowDescriptionMessage

interface PostgreSQLConnectionDelegate {
  fun onAuthenticationResponse(message: AuthenticationMessage)
  fun onCommandComplete(message: CommandCompleteMessage)
  fun onDataRow(message: DataRowMessage)
  fun onError(message: ErrorMessage)
  fun onError(throwable: Throwable)
  fun onParameterStatus(message: ParameterStatusMessage)
  fun onReadyForQuery()
  fun onRowDescription(message: RowDescriptionMessage)
  fun onNotificationResponse(message: NotificationResponse)
}
