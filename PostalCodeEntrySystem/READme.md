# Postal Code Entry System

## Overview

Welcome to the Postal Code Entry System! This is a Java application that I developed to manage postal code entries efficiently. The application allows users to store and retrieve information related to postal codes in a structured manner. It reads data from a CSV file containing postal code information for Ottawa and enables searching for postal codes by generating random prefixes.

## Features

- **Postal Code Management**: Users can create, retrieve, and display postal code entries seamlessly.
- **Random Prefix Generation**: The application generates random postal code prefixes for testing and search purposes, enhancing usability.
- **CSV File Integration**: I implemented functionality to read postal code data from a CSV file and store it in a map for quick access.

## Technologies Used

In developing this application, I utilized the following technologies:

- **Java SE**: The primary programming language for the application.
- **SecureRandom**: A class used for generating random prefixes for postal codes.
- **BufferedReader**: Employed to read data from CSV files efficiently.
- **Collections (HashMap)**: Used for storing postal code entries, allowing for quick retrieval.

## Project Structure

Here’s a brief overview of the project structure:

PostalCodeEntrySystem/
├── PostalCodeEntry.java        # Class for representing a postal code entry
├── PostalCodeSearchTest.java    # Main class for testing postal code retrieval
├── ottawa_postal_codes.csv      # Sample CSV file containing postal code data
└── README.md                    # Project documentation