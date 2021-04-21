package com.othman.autobet.ui

import com.othman.autobet.model.Match

interface AddDialogListener {

    fun onAddButtonClicked(match: Match)
}